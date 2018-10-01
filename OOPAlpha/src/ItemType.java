/*
 * 10/1/2018
 * Author: T. Martin
 * Description: Enum ItemType holds two character codes for specific item types.
 */

//Stores two character code for item types
enum ItemType{
  AUDIO("AU"),
  VISUAL("VI"),
  AUDIOMOBILE("AM"),
  VISUALMOBILE("VM");
  
  String typeCode;
  
  ItemType(String typeCode) {
    this.typeCode = typeCode;
  }
  
  public String getCode() {
    return typeCode;
  }
}