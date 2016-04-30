package com.androidnetworking.error;

import com.androidnetworking.common.AndroidNetworkingData;
import com.androidnetworking.common.Constants;

/**
 * Created by amitshekhar on 22/03/16.
 */
public class AndroidNetworkingError extends Exception {

    private AndroidNetworkingData data;

    private String content;

    private boolean hasErrorFromServer = false;

    private String error;

    public AndroidNetworkingError() {
    }

    public AndroidNetworkingError(AndroidNetworkingData data) {
        this.data = data;
    }

    public AndroidNetworkingError(String message) {
        super(message);
    }

    public AndroidNetworkingError(String message, AndroidNetworkingData data) {
        super(message);
        this.data = data;
    }

    public AndroidNetworkingError(String message, Throwable throwable) {
        super(message, throwable);
    }

    public AndroidNetworkingError(String message, AndroidNetworkingData data, Throwable throwable) {
        super(message, throwable);
        this.data = data;
    }

    public AndroidNetworkingError(AndroidNetworkingData data, Throwable throwable) {
        super(throwable);
        this.data = data;
    }

    public AndroidNetworkingError(Throwable throwable) {
        super(throwable);
    }

    public AndroidNetworkingData getData() {
        return data;
    }

    public String getContent() {
        return content;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError() {
        return this.error;
    }

    public void setHasErrorFromServer() {
        this.hasErrorFromServer = true;
        this.error = Constants.ERROR_RESPONSE_FROM_SERVER;
    }

    public void setCancellationMessageInError() {
        this.hasErrorFromServer = false;
        this.error = Constants.ERROR_REQUEST_CANCELLED;
    }

    public boolean hasErrorFromServer() {
        return this.hasErrorFromServer;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
