package br.com.rodslab.app.entrypoint.rest;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodslab.core.usecase.CreateRatingUseCase;
import br.com.rodslab.core.usecase.command.CreateRatingCommand;
import br.com.rodslab.core.usecase.representation.CreateRatingRepresentation;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/")
public class RatingEntryPoint {
	
	private CreateRatingUseCase createRatingUseCase;
	
	@PostMapping
	public ResponseEntity<CreateRatingRepresentation> create(@Valid @RequestBody CreateRatingCommand createRatingCommand) {
		return ResponseEntity.ok(createRatingUseCase.execute(createRatingCommand));
	}

}
