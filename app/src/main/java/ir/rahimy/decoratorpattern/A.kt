package ir.rahimy.decoratorpattern

interface A {
    fun a()
}

interface B {
    fun b()
}

class AA : A {
    override fun a() {
        println("a with AA")
    }
}

class BB : B {
    override fun b() {
        println("b with BB")
    }
}

class C : A by AA(), B by BB()

class Test{
    fun test(){
        val c = C()
        c.a()
        c.b()
    }
}