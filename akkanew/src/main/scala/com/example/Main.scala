package com.example
import org.slf4j.LoggerFactory
import ch.qos.logback.core.util.StatusPrinter
import ch.qos.logback.classic.LoggerContext

object LogTester extends App{
  def logger = LoggerFactory.getLogger("myLogs")
  StatusPrinter.print((LoggerFactory.getILoggerFactory).asInstanceOf[LoggerContext])
  logger.info("user driven log")
  logger.trace("full error log with message")
  logger.warn("dont do this or you will get an error")
  logger.error("error in this code")
  logger.debug("do this or download this to avoid or correct bugs")
}
