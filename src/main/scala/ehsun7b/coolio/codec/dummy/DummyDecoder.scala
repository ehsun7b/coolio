package ehsun7b.coolio.codec.dummy

import ehsun7b.coolio.Result
import ehsun7b.coolio.codec.Decoder
import ehsun7b.coolio.entity.Entry

//object DummyDecoder extends Decoder {
//  override def decode(str: String): Result[Entry] = {
//    try {
//      val parts: Array[String] = str.split("-")
//      Entry(id = parts(0), name = parts(1), password = parts(2), url = parts.lift(), note = ???, icon = ???)
//    } catch {
//      case t: Throwable => Result.failed(t)
//    }
//  }
//}
