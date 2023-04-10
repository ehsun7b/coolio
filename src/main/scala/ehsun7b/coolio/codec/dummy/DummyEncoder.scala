package ehsun7b.coolio.codec.dummy

import ehsun7b.coolio.Result
import ehsun7b.coolio.codec.Encoder
import ehsun7b.coolio.entity.Entry

object DummyEncoder extends Encoder {
  override def encode(entry: Entry): Result[String] = {
    val e = entry
    Result.success(s"${e.id}-${e.name}-${e.password}-${e.url}-${e.icon}-${e.note}")
  }
}
