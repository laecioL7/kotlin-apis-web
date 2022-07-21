package com.br.thelovecats.whatswebhook.controller

import com.br.thelovecats.whatswebhook.rest.WebhookRequest
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest

@RestController
class WebhookController {

    @Value("\${process.env.verify_token}")
    lateinit var VERIFY_TOKEN: String;

    @GetMapping("/webhook")
    fun configureWebhook(@RequestParam("hub.mode") mode:String, @RequestParam("hub.verify_token") token: String,
                         @RequestParam("hub.challenge") challenge: String): ResponseEntity<String>  {
        if(mode == "subscribe" && token == VERIFY_TOKEN){
            println("Webhook verificado")
            return ResponseEntity.ok().body(challenge);
        }else{
            return ResponseEntity.internalServerError().build();
        }
    }

    /**Recebe varios tipos de request do whats*/
    @PostMapping("/webhook")
    fun webhookGeneralEndpoint(req: HttpServletRequest,@RequestBody request: WebhookRequest): ResponseEntity<WebhookRequest>  {
        //TODO:
        return ResponseEntity.ok().body(request);
    }

    @GetMapping("/test")
    fun test(req: HttpServletRequest): ResponseEntity<String> {
        println("Test started")
        println("Imprimindo headers")
        println(req.headerNames.toList().forEach {
            println("The element is $it")
        })

        println("Imprimindo parametros")
        println(req.parameterNames.toList().forEach {
            println("The element is $it")
        })

        return ResponseEntity.ok().body(VERIFY_TOKEN);
    }

    fun getDate(){

    }
}