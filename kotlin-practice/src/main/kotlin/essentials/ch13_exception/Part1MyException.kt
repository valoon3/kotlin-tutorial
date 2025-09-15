package essentials.ch13_exception

class Part1MyException: Throwable("Some error message")

object MyExceptionObject: Throwable("Some object error message")