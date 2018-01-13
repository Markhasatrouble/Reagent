/*
 * Copyright 2016 Jake Wharton
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package reagent

import reagent.operator.flatMap
import reagent.source.emptyMaybe
import reagent.source.emptyTask
import reagent.source.maybeOf
import reagent.source.toMaybe
import reagent.tester.testTask
import kotlin.test.Ignore
import kotlin.test.Test

class MaybeFlatMapTest {
// TODO overload resolution doesn't work here
//  @Test fun flatMapMany() = runTest {
//    maybeOf("Item")
//        .flatMap { manyOf("Hello", "World") }
//        .testMany {
//          item("Hello")
//          item("World")
//          complete()
//        }
//  }
//
//  @Test fun flatMapManyNothing() = runTest {
//    emptyMaybe<String>()
//        .flatMap { manyOf("Hello", "World") }
//        .testMany {
//          complete()
//        }
//  }
//
//  @Test fun flatMapManyError() = runTest {
//    val exception = RuntimeException("Oops!")
//    exception.toMaybe<String>()
//        .flatMap { manyOf("Hello", "World") }
//        .testMany {
//          error(exception)
//        }
//  }
//
//  @Test fun flatMapMaybe() = runTest {
//    maybeOf("Item")
//        .flatMap { maybeOf("Hello") }
//        .testMaybe {
//          item("Hello")
//        }
//  }
//
//  @Test fun flatMapMaybeNothing() = runTest {
//    emptyMaybe<String>()
//        .flatMap { maybeOf("Hello") }
//        .testMaybe {
//          nothing()
//        }
//  }
//
//  @Test fun flatMapMaybeError() = runTest {
//    val exception = RuntimeException("Oops!")
//    exception.toMaybe<String>()
//        .flatMap { maybeOf("Hello") }
//        .testMaybe {
//          error(exception)
//        }
//  }
//
//  @Test fun flatMapOne() = runTest {
//    maybeOf("Item")
//        .flatMap { oneOf("Hello") }
//        .testMaybe {
//          item("Hello")
//        }
//  }
//
//  @Test fun flatMapOneComplete() = runTest {
//    emptyMaybe<String>()
//        .flatMap { oneOf("Hello") }
//        .testMaybe {
//          nothing()
//        }
//  }
//
//  @Test fun flatMapOneError() = runTest {
//    val exception = RuntimeException("Oops!")
//    exception.toMaybe<String>()
//        .flatMap { oneOf("Hello") }
//        .testMaybe {
//          error(exception)
//        }
//  }

  @Ignore // Not implemented.
  @Test fun flatMapTask() = runTest {
    maybeOf("Item")
        .flatMap { emptyTask() }
        .testTask {
          complete()
        }
  }

  @Ignore // Not implemented.
  @Test fun flatMapTaskComplete() = runTest {
    emptyMaybe<String>()
        .flatMap { emptyTask() }
        .testTask {
          complete()
        }
  }

  @Ignore // Not implemented.
  @Test fun flatMapTaskError() = runTest {
    val exception = RuntimeException("Oops!")
    exception.toMaybe<String>()
        .flatMap { emptyTask() }
        .testTask {
          error(exception)
        }
  }
}
