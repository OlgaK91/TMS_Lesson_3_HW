/**
 * Класс Register -
 * конструктор класса задает массив строк заданной длины
 * метод addNewDocument -  добавляет в массив строковое описание номера и даты документа
 * метод documentInfo - обеспечивает вывод информации о документе
 */
package com.tms.register;

import com.tms.documents.Contract;

public class Register implements RegisterMotion {
    public Contract[] documents;

    public Register(int len) {
        this.documents = new Contract[len];
    }

    @Override
    public Contract[] addNewDocument(Contract myNewContract) {
        for (int i = 0; i < documents.length; i++) {
            if (documents[i] == null) {
                documents[i] = myNewContract;
                break;
            }

        }
        return documents;

    }


    @Override
    public void documentInfo(Contract myNewContract) {
        myNewContract.infoToString();

    }


}
