package ehsun7b.coolio

import cats.effect.{ExitCode, IO, IOApp}
import scala.io.StdIn
import Console.{BLINK, GREEN, RED, RESET, UNDERLINED, YELLOW_B, WHITE, RED_B}
object Main extends IOApp {
  override def run(args: List[String]): IO[ExitCode] = for {
    _ <- IO.delay(Console.println(s"${RESET}${RED_B}${WHITE}hello${RESET}"))
  } yield ExitCode.Success
}
