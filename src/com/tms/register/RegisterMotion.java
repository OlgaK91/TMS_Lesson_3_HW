package com.tms.register;

import com.tms.documents.Contract;

public interface RegisterMotion {

    String[] addNewDocument(Contract myNewContract);

    void documentInfo(Contract myNewContract);
}
