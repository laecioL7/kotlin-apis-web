package com.br.thelovecats.whatswebhook.model.webhook

data class Contacts (
  var profile : Profile? = Profile(),
  var wa_id    : Int?  = null
)