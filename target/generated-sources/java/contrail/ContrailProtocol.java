/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package contrail;

@SuppressWarnings("all")
/** Data structures for contrail */
public interface ContrailProtocol {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"ContrailProtocol\",\"namespace\":\"contrail\",\"types\":[{\"type\":\"record\",\"name\":\"SequenceReadByte\",\"doc\":\"Structure representing a DNA sequence read encoded as byte array.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\",\"doc\":\"ID for the read.\"},{\"name\":\"dna\",\"type\":\"bytes\",\"doc\":\"The dna sequence for this read.\"},{\"name\":\"mate_pair_id\",\"type\":\"int\",\"doc\":\"ID indicating which mate pair this sequence belongs to\"}]},{\"type\":\"record\",\"name\":\"NodeData\",\"doc\":\"Store the data for a node in the DeBrujin graph\",\"fields\":[{\"name\":\"fields\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"string\"}},\"doc\":\"map storing the fields for this node\"},{\"name\":\"mertag\",\"type\":\"string\",\"doc\":\"Tag for the kmer\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** Data structures for contrail */
  public interface Callback extends ContrailProtocol {
    public static final org.apache.avro.Protocol PROTOCOL = contrail.ContrailProtocol.PROTOCOL;
  }
}