package com.br.thelovecats.whatswebhook.model.webhook

import lombok.Getter
import lombok.Setter

@Getter
@Setter
class Entry {
     var id: String? = null
     var changes: MutableList<Changes>? = null
}