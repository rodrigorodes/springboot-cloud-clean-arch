package br.com.rodslab.app.entrypoint;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodslab.core.usecase.CreateBookUseCase;
import br.com.rodslab.core.usecase.FindAllBookUseCase;
import br.com.rodslab.core.usecase.FindBookByIdUseCase;
import br.com.rodslab.core.usecase.command.CreateBookCommand;
import br.com.rodslab.core.usecase.command.FindBookByIdCommand;
import br.com.rodslab.core.usecase.command.PageCommand;
import br.com.rodslab.core.usecase.representation.CreateBookRepresentation;
import br.com.rodslab.core.usecase.representation.FindAllBookRepresentation;
import br.com.rodslab.core.usecase.representation.FindBookByIdRepresentation;
import br.com.rodslab.core.usecase.representation.PageRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class BookRestEntryPoint {

	private CreateBookUseCase createBookUseCase;
	private FindAllBookUseCase findAllBookUseCase;
	private FindBookByIdUseCase findBookByIdUseCase;

	@PostMapping
	public ResponseEntity<CreateBookRepresentation> createEndPoint(@RequestBody CreateBookCommand createBookCommand) {
		return ResponseEntity.ok(createBookUseCase.execute(createBookCommand));
	}

	@GetMapping
	public ResponseEntity<PageRepresentation<FindAllBookRepresentation>> findAllBooks(@Valid PageCommand pageCommand) {
		return ResponseEntity.ok(findAllBookUseCase.execute(pageCommand));
	}
	
	@GetMapping("/{bookId}")
	public ResponseEntity<FindBookByIdRepresentation> FindBookById(@Valid FindBookByIdCommand findBookByIdCommand) {
		
		Optional<FindBookByIdRepresentation> findBookByIdRepresentationOptional = findBookByIdUseCase.execute(findBookByIdCommand);
		
		if(findBookByIdRepresentationOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		return ResponseEntity.ok(findBookByIdRepresentationOptional.get());
	}

}
