def call(Map config=[:]) {
  sh "echo hello ${config.name}. day of week is ${config.dayOfWeek} "
}
