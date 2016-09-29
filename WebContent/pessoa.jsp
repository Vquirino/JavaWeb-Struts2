<%@taglib uri="/struts-tags" prefix="s"%>

<s:head theme="ajax"/>

<h3>COTI Informática</h3>
Manter dados da Pessoa

<br/><br/>

<s:tabbedPanel id="cadastro" cssStyle="width: 600px;">

	<s:div id="formulario" label="Cadastro de Pessoa" theme="ajax" labelposition="top" cssStyle="padding: 20px;">
		<br/>
		<s:form id="formcadastro" action="pessoa.cadastrar">
			<s:textfield name="nome" label="Informe seu nome" required="true"/>
			<s:datetimepicker name="dataNasc" label="Data de Nascimento" required="true"/>
			<s:submit value="Realizar Cadastro"/>
		</s:form>
		${mensagem}
	</s:div>
	
	<s:div id="tabela" label="Dados Cadastrados" theme="ajax" labelposition="top" cssStyle="padding: 20px;">
		<table border="1" width="100%">
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>Data de Nascimento</th>
			</tr>
			
			<s:iterator value="dados">
			
			<tr>
				<td> <s:property value="idPessoa"/>  </td>
				<td> <s:property value="nome"/> </td>
				<td> <s:property value="dataNasc"/> </td>
			</tr>
			
			</s:iterator>
			
		</table>
		Total de registros: <s:property value="dados.size()"/>
	</s:div>

</s:tabbedPanel>