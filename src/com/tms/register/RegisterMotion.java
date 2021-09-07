package com.tms.register;

import com.tms.documents.Contract;

public interface RegisterMotion {

    Contract[] addNewDocument(Contract myNewContract);

    void documentInfo(Contract myNewContract);
}
