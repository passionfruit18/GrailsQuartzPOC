package grailsquartzpoc



class TestJob {

    static triggers = {
      simple name: "mySimpleTrigger", repeatInterval: 10000l // execute job once in 5 seconds
    }

    def group = "MyGroup"
    def description = "Example job with Simple Trigger"

    def execute() {
        println "Hello World from TestJob!"
    }
}
