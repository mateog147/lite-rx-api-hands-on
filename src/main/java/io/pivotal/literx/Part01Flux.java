package io.pivotal.literx;

import org.assertj.core.util.Arrays;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

/**
 * Learn how to create Flux instances.
 *
 * @author Sebastien Deleuze
 * @see <a href="https://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Return an empty Flux
	Flux<String> emptyFlux() {

		return Flux.empty();
	}

//========================================================================================

	// TODO Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
	Flux<String> fooBarFluxFromValues() {
		return Flux.just("foo", "bar");
	}

//========================================================================================

	// TODO Create a Flux from a List that contains 2 values "foo" and "bar"
	Flux<String> fooBarFluxFromList() {
		String[] words = {"foo", "bar"};
		List list = Arrays.asList(words);
		return Flux.fromIterable(list);
	}

//========================================================================================

	// TODO Create a Flux that emits an IllegalStateException
	Flux<String> errorFlux() {

		return Flux.error(new IllegalStateException("simulated error"));

	}

//========================================================================================

		// TODO Create a Flux that emits increasing values from 0 to 9 each 100ms
	Flux<Long> counter() {
		Long[] numbers = {0l, 1L, 2L, 3L, 4L, 5L , 6L , 7L, 8L , 9L};
		List list = Arrays.asList(numbers);
		return Flux.fromIterable(list)
				.delayElements(Duration.ofMillis(100));
	}

}
