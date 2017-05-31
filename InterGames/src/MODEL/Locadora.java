/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import DAO.DAOClientes;
import DAO.DAOTitulos;
import java.util.ArrayList;

/**
 *
 * @author ALUNO
 */
public class Locadora {
    ArrayList<Titulos> listatitulos;
    public void incluirTitulos(int codigo, String genero,String nome,String ano,String midia,String atores,String audios,String legendas,String classind,String sinopse)
    {
        DAOTitulos dao = new DAOTitulos();
        Titulos novotitulo = new Titulos();
        novotitulo.setCodigo(codigo);
        novotitulo.setGenero(genero);
        novotitulo.setNome(nome);
        novotitulo.setAno(ano);
        novotitulo.setMidia(midia);
        novotitulo.setAtores(atores);
        novotitulo.setAudios(audios);
        novotitulo.setLegendas(legendas);
        novotitulo.setClassInd(classind);
        novotitulo.setSinopse(sinopse);
        dao.salvarTitulos(novotitulo.getCodigo(),novotitulo.getGenero(),novotitulo.getNome(),novotitulo.getAno(),novotitulo.getMidia(),novotitulo.getAtores(),novotitulo.getAudios(),novotitulo.getLegendas(),novotitulo.getClassInd(),novotitulo.getSinopse());
    }
    ArrayList<Clientes> listaclientes;
    public void incluirClientes(int codigo,String nome,String cpf,String rg,String dtexp,String sexo,String telefone,String celular,String comercial,String outro,String rua,String numero,String complemento,String cep,String bairro,String cidade,String uf,String email,String comprovante,String nomedep1,String obs1,String nomedep2,String obs2)
    {
        DAOClientes dao = new DAOClientes();
        Clientes novocliente = new Clientes();
        novocliente.setCodigo(codigo);
        novocliente.setNome(nome);
        novocliente.setCpf(cpf);
        novocliente.setRg(rg);
        novocliente.setDtexp(dtexp);
        novocliente.setSexo(sexo);
        novocliente.setTelefone(telefone);
        novocliente.setCelular(celular);
        novocliente.setComercial(comercial);
        novocliente.setOutro(outro);
        novocliente.setRua(rua);
        novocliente.setNumero(numero);
        novocliente.setComplemento(complemento);
        novocliente.setCep(cep);
        novocliente.setBairro(bairro);
        novocliente.setCidade(cidade);
        novocliente.setUf(uf);
        novocliente.setEmail(email);
        novocliente.setComprovante(comprovante);
        novocliente.setNomedep1(nomedep1);
        novocliente.setObs1(obs1);
        novocliente.setNomedep2(nomedep2);
        novocliente.setObs2(obs2);
        dao.salvarClientes(novocliente.getCodigo(),novocliente.getNome(),novocliente.getCpf(),novocliente.getRg(),novocliente.getDtexp(),novocliente.getSexo(),novocliente.getTelefone(),novocliente.getCelular(),novocliente.getComercial(),novocliente.getOutro(),novocliente.getRua(),novocliente.getNumero(),novocliente.getComplemento(),novocliente.getCep(),novocliente.getBairro(),novocliente.getCidade(),novocliente.getUf(),novocliente.getEmail(),novocliente.getComprovante(),novocliente.getNomedep1(),novocliente.getObs1(),novocliente.getNomedep2(),novocliente.getObs2());
        
    }
    
    public ArrayList<Titulos> preencheCombobox() {        
        DAOTitulos dao = new DAOTitulos();
        this.listatitulos = dao.buscarTitulos();

        return listatitulos;

    }
}
