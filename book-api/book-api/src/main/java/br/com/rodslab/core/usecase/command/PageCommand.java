package br.com.rodslab.core.usecase.command;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PageCommand {

	@NotNull
    private Integer page;
	@NotNull
    private Integer size;
}
