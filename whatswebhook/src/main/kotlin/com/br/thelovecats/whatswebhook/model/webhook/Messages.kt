package com.br.thelovecats.whatswebhook.model.webhook


data class Messages(
    var from: Int? = null,
    var id: String? = null,
    var timestamp: String? = null,
    var text: Text? = Text(),
    var type: String? = null
)