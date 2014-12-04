package com.quantweb.marketdata

import akka.actor.Actor

/**
 * Created by Richard S, Imaoka on 2014/11/30.
 */
class SymbolActor extends Actor {

    var data: Map[String, Any] = Map[String, Any]()

    override def receive = {
        case receivedData: Map[String, Any] => data = receivedData
    }

}
