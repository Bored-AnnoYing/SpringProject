package com.henfanren.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: SpringProject
 * @ClassName: TextEditor
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 15:35
 * @Modified By:
 */
public class TextEditor {

    @Autowired
    private SpellChecker spellChecker;
    private String name;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellChecke(){
        spellChecker.checkSpelling();
    }

}
