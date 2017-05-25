package io.github.tickcoder.httpserver;

import java.util.Map;

/**
 * Created by claris on 2017.05.25.Thursday.
 */

public class HttpServer {
    private int mPort;
    private int mTimeout;
    private Map<String, IRequestHandler> mHandlerMap;
}
