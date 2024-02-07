package edu.william.java.exceptions.desafio02.model.exceptions;

import java.io.Serial;

public class MyExceptions extends  RuntimeException {

        @Serial
        private static final long serialVersionUID = 1L;


        public MyExceptions(String msg) {
            super(msg);
        }


}




