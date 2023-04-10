package ehsun7b.coolio

import cats.effect.{ExitCode, IO, IOApp}
import ehsun7b.coolio.entity.Entry

import java.util.UUID
import scala.io.StdIn
import Console.{BLINK, GREEN, RED, RED_B, RESET, UNDERLINED, WHITE, YELLOW}
object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO(println("ok"))
    entry = Entry(UUID.randomUUID(), "test", "password", None, None, Some('a'))
    _ <- IO.delay(Console.println(s"${RESET}${RED_B}${YELLOW}hello${RESET}\n$entry"))
  } yield ExitCode.Success
}
