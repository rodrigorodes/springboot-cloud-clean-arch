package br.com.rodslab.core.usecase.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindBookByIdCommand {

	private Long bookId;
}
