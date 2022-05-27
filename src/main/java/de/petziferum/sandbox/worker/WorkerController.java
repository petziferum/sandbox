package de.petziferum.sandbox.worker;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.webjars.NotFoundException;

import java.util.List;

@RestController
public class WorkerController {
    @Autowired
    WorkerRepository workerRepository;

    @GetMapping("/woker")
    @Operation(summary = "Gibt ein Object mit 'value' aus in dem alle Woker enthalten sind.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(schema = @Schema(type = "object", implementation = Worker.class)))
    })
    public ResponseEntity<Model> listAll(Model model) {

        try {
            List<Worker> workerList = workerRepository.findAll();
            model.addAttribute("value", workerList);
            return ResponseEntity.ok(model);
        } catch(NotFoundException e) {
            throw e;
        }

    }
}
