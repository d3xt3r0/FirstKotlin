package day3.thread

class Task2 : Thread(){
    override fun run() {
        super.run()
        for (i in 0..9) {
            println("Task2")
            Thread.sleep(1000)
        }
    }
}