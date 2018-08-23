package com.firminapp.owomithirdparty.operations;

import android.os.Bundle;

import com.firminapp.owomithirdparty.operations.types.OperationType;

/**
 * Created by firmin on 23/07/18.
 */

public class Authientification extends Operation {
    /**
     * superclass of operations
     *
     * @param sdkId to identifie the sdk which init this operation
     */
    public Authientification(String sdkId) {
        super(sdkId);
        this.setOperationType(OperationType.AUTHENTIFICATION);
    }
}
