package com.br.thelovecats.whatswebhook.model.webhook

data class Value(
    var messaging_product: String? = null,
    var metadata: Metadata? = Metadata(),
    var contacts: ArrayList<Contacts> = arrayListOf(),
    var messages: ArrayList<Messages> = arrayListOf()
)