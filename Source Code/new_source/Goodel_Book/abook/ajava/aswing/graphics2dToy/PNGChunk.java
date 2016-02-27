package abook.ajava.aswing.graphics2dToy;

import java.io.*;

/**
 * <p>Title: </p>
 *
 * <p>Description: </p>
 *
 * <p>Copyright: Copyright (c) 2005</p>
 *
 * <p>Company: jgreenbeans.org</p>
 *
 * @author Bambang Hariyanto
 * @version 1.0
 */
public class PNGChunk {
  private byte[] mType;
  private byte[] mData;
  public PNGChunk(byte[] type, byte[] data) {
    mType = type;
    mData = data;
  }

  public String getTypeString() {
    try {
      return new String(mType, "UTF8");
    }
    catch (UnsupportedEncodingException uee) {
      return "";
    }
  }

  public byte[] getData() {
    return mData;
  }

  public long getUnsignedInt(int offset) {
    long value = 0;
    for (int i = 0; i < 4; i++) {
      value += (mData[offset + i] & 0xff) << ( (3 - i) * 8);
    }
    return value;
  }

  public short getUnsignedByte(int offset) {
    return (short) (mData[offset] & 0x00ff);
  }
}
