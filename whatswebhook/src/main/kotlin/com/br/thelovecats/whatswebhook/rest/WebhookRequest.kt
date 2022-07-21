package com.br.thelovecats.whatswebhook.rest

import com.br.thelovecats.whatswebhook.model.webhook.Entry
import lombok.Getter
import lombok.Setter

@Getter
@Setter
class WebhookRequest {
   lateinit var entry: MutableList<Entry>;
   //object
}
