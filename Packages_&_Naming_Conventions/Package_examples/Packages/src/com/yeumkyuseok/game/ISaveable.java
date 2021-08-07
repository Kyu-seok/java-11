package com.yeumkyuseok.game;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}
