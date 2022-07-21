package com.br.thelovecats.whatswebhook.model.webhook

import lombok.Getter
import lombok.Setter

@Getter
@Setter
class Changes {
     var value: Value? = null
     var field: String? = null
}