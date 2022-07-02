package ch.legrange.patterns.command.controller


import ch.legrange.patterns.command.commands.SetContentCommand
import ch.legrange.patterns.command.service.ApplicationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ApplicationController {

    @Autowired
    ApplicationService applicationService

    @GetMapping('/edit')
    String greeting(Model model) {
        model.addAttribute('command', new SetContentCommand())
        return 'edit'
    }

    @PostMapping(path = "/edit", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    String setContent(SetContentCommand command, Model model) {
        applicationService.executeCommand(command)
        model.addAttribute('command', command)
        model.addAttribute('history', applicationService.history)
        return 'edit'
    }
}
