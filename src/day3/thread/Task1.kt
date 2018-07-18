package day3.thread

class Task1 : Thread(){
    override fun run() {
        super.run()
        for (i in 0..9) {
            println("Task1")
            Thread.sleep(1000)
        }
    }
}