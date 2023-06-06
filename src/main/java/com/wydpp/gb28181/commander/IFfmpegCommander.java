package com.wydpp.gb28181.commander;

public interface IFfmpegCommander {

    String pushStream(String callId, String filePath, String ip, int port, int ssrc);

    void closeStream(String callId);

    void closeAllStream();
}
