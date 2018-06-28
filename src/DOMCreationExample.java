import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Text;

public class DOMCreationExample {
	
	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory domBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder domBuilder = domBuilderFactory.newDocumentBuilder();
		Document document = domBuilder.newDocument();
		
		Text node = document.createTextNode("employees");
		Text childNode = document.createTextNode("employee");
		node.appendChild(childNode);
		document.appendChild(node);
	}

}
