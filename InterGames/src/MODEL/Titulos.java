/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author ALUNO
 */
public class Titulos {
    int codigo;
    String genero;
    String nome;
    String ano;
    String midia;
    String atores;
    String audios;
    String legendas;
    String classind;
    String sinpose;
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public void setGenero(String genero)
    {
        this.genero = genero;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public void setAno(String ano)
    {
        this.ano = ano;
    }
    public void setMidia(String midia)
    {
        this.midia = midia;
    }
    public void setAtores(String atores)
    {
        this.atores = atores;
    }
    public void setAudios(String audios)
    {
        this.audios = audios;
    }
    public void setLegendas(String legendas)
    {
        this.legendas = legendas;
    }
    public void setClassInd(String classind)
    {
        this.classind = classind;
    }
    public void setSinopse(String sinpose)
    {
        this.sinpose = sinpose;
    }
    
    
    public int getCodigo()
    {
        return this.codigo;
    }
    public String getGenero()
    {
        return this.genero;
    }
    public String getNome()
    {
        return this.nome;
    }
    public String getAno()
    {
        return this.ano;
    }
    public String getMidia()
    {
        return this.midia;
    }
    public String getAtores()
    {
        return this.atores;
    }
    public String getAudios()
    {
        return this.audios;
    }
    public String getLegendas()
    {
        return this.legendas;
    }
    public String getClassInd()
    {
        return this.classind;
    }
    public String getSinopse()
    {
        return this.sinpose;
    }
}
