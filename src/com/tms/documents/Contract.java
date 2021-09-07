/**
* Абстрактный класс Contract содержит общие для всех контрактов поля documentNumber и documentDate
 * и метод infoToString() - для вывода описания каждого объекта класса Contract
 */

package com.tms.documents;
import java.util.Date;

abstract public class Contract {

    protected String documentNumber;
    protected Date documentDate;

    abstract public void infoToString();

}
