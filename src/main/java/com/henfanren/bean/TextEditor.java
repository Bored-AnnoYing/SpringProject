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

    public TextEditor(SpellChecker spellChecker){
        System.out.println("Inside TextEditor constructor");
        this.spellChecker = spellChecker;
    }

    public void spellChecke(){
        spellChecker.checkSpelling();
    }

}
