package reagent.operator

import reagent.Observable
import reagent.Task

fun <I> Observable<I>.all(predicate: (I) -> Boolean): Task<Boolean> = ObservableAll(this, predicate)

internal class ObservableAll<out I>(
  private val upstream: Observable<I>,
  private val predicate: (I) -> Boolean
) : Task<Boolean>() {
  override suspend fun produce(): Boolean {
    var result = true
    upstream.subscribe {
      if (result && !predicate(it)) {
        result = false
        return@subscribe false
      }
      return@subscribe true
    }
    return result
  }
}
