package com.henfanren.bean;

/**
 * @ProjectName: SpringProject
 * @ClassName: TextEditor
 * @Description:
 * @Author: zhanzhao
 * @Date: Created in 2018/7/18 15:35
 * @Modified By:
 */
public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

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
