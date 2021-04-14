/**
 * Petter's forked version of Filip´s API of Things
 * Some description here of the full API  GitHub Flavored Markdown can be used for rich text representation,     such as **bold**, *italic* and [links](https://swagger.io).           # Useful links for the tasks:  * **[REST Design Guidelines V4](https://confluence.tech.dnb.no/pages/viewpage.action?pageId=33488367)**  * **[SwaggerHub Way of Work](https://confluence.tech.dnb.no/display/KKO/SwaggerHub%3A+REST+API+Design+tool\\#SwaggerHub:RESTAPIDesigntool-WayofWork)**      
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import io.swagger.client.model._
import org.json4s._
import scala.reflect.ClassTag

object EnumsSerializers {

  def all: Seq[Serializer[_]] = Seq[Serializer[_]]() :+
    new EnumNameSerializer(PostThingRequestEnums.Field4) :+
    new EnumNameSerializer(ThingEnums.Field4) :+
    new EnumNameSerializer(ThingBaseEnums.Field4)

  private class EnumNameSerializer[E <: Enumeration: ClassTag](enum: E)
    extends Serializer[E#Value] {
    import JsonDSL._

    val EnumerationClass: Class[E#Value] = classOf[E#Value]

    def deserialize(implicit format: Formats):
    PartialFunction[(TypeInfo, JValue), E#Value] = {
      case (t @ TypeInfo(EnumerationClass, _), json) if isValid(json) =>
        json match {
          case JString(value) =>
            enum.withName(value)
          case value =>
            throw new MappingException(s"Can't convert $value to $EnumerationClass")
        }
    }

    private[this] def isValid(json: JValue) = json match {
      case JString(value) if enum.values.exists(_.toString == value) => true
      case _ => false
    }

    def serialize(implicit format: Formats): PartialFunction[Any, JValue] = {
      case i: E#Value => i.toString
    }
  }

}
