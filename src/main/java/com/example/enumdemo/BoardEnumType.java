package com.example.enumdemo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

public class BoardEnumType {

    @RequiredArgsConstructor
    public enum BoardType implements EnumEntity {
        N("공지사항", "notice"), //공지사항
        F("FAQ", "faq"), // FAQ
        T("튜토리얼", "totu"); //튜토리얼

        @Getter
        private final String value;

        @Getter
        private final String engval;

        @Override
        public String getKey() {
            return name();
        }
    }

    public enum UseYn implements EnumEntity{
        Y("사용", "USED"),
        N("미사용", "UNUSED");

        private final String value;
        private final String engval;


        UseYn(String value, String engval) {
            this.value = value;
            this.engval = engval;
        }

        @Override
        public String getValue() {
            return this.value;
        }

        @Override
        public String getEngval(){
            return this.engval;
        };

        @Override
        public String getKey() {
            return name();
        }

    }

    //웹,모바일 구분
    @RequiredArgsConstructor
    public enum DivType implements EnumEntity{
        W("웹", "web"),//웹
        M("모바일", "mobile");//모바일

        @Getter
        private final String value;

        @Getter
        private final String engval;

        @Override
        public String getKey() {
            return name();
        }

    }

}
