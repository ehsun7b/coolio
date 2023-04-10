package ehsun7b

import cats.data.EitherT
import cats.effect.IO

package object coolio {

  type Result[A] = EitherT[IO, Throwable, A]

  object Result {

    def apply[A](either: IO[Either[Throwable, A]]): Result[A] = {
      EitherT(either)
    }

    def success[A](a: A): Result[A] = {
      EitherT[IO, Throwable, A](IO(Right(a)))
    }

    def pure[A](a: A): Result[A] = {
      EitherT.pure[IO, Throwable](a)
    }

    def delay[A](a: A): Result[A] = {
      EitherT[IO, Throwable, A](IO.delay(Right(a)))
    }

    def failed[A](t: Throwable): Result[A] = {
      EitherT.leftT(t)
    }

    def unit: Result[Unit] = {
      EitherT.pure(())
    }
  }
}
