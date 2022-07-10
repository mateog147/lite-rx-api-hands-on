package io.pivotal.literx;

@FunctionalInterface
public interface CheckFunction <T,R>{

        R apply(T t) throws Exception;
}
