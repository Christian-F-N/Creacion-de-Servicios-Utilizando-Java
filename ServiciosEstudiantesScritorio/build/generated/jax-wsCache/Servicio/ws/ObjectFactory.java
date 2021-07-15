
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _ObtEstudiante_QNAME = new QName("http://ws/", "obtEstudiante");
    private final static QName _AddNota_QNAME = new QName("http://ws/", "addNota");
    private final static QName _FiltroNotas_QNAME = new QName("http://ws/", "filtroNotas");
    private final static QName _AddProm_QNAME = new QName("http://ws/", "addProm");
    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _ListarNotasResponse_QNAME = new QName("http://ws/", "listarNotasResponse");
    private final static QName _FiltrarProfe_QNAME = new QName("http://ws/", "filtrarProfe");
    private final static QName _FiltroNotasResponse_QNAME = new QName("http://ws/", "filtroNotasResponse");
    private final static QName _ListaProfes_QNAME = new QName("http://ws/", "listaProfes");
    private final static QName _Estudianteslist_QNAME = new QName("http://ws/", "Estudianteslist");
    private final static QName _ListaProfesResponse_QNAME = new QName("http://ws/", "listaProfesResponse");
    private final static QName _ListarNotas_QNAME = new QName("http://ws/", "listarNotas");
    private final static QName _NotasP1P2Response_QNAME = new QName("http://ws/", "notasP1P2Response");
    private final static QName _NotasP1P2_QNAME = new QName("http://ws/", "notasP1P2");
    private final static QName _AddNotaResponse_QNAME = new QName("http://ws/", "addNotaResponse");
    private final static QName _ObtEstudianteResponse_QNAME = new QName("http://ws/", "obtEstudianteResponse");
    private final static QName _FiltrarProfeResponse_QNAME = new QName("http://ws/", "filtrarProfeResponse");
    private final static QName _AddPromResponse_QNAME = new QName("http://ws/", "addPromResponse");
    private final static QName _EstudianteslistResponse_QNAME = new QName("http://ws/", "EstudianteslistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link ObtEstudiante }
     * 
     */
    public ObtEstudiante createObtEstudiante() {
        return new ObtEstudiante();
    }

    /**
     * Create an instance of {@link AddNota }
     * 
     */
    public AddNota createAddNota() {
        return new AddNota();
    }

    /**
     * Create an instance of {@link FiltroNotas }
     * 
     */
    public FiltroNotas createFiltroNotas() {
        return new FiltroNotas();
    }

    /**
     * Create an instance of {@link AddProm }
     * 
     */
    public AddProm createAddProm() {
        return new AddProm();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link ListarNotasResponse }
     * 
     */
    public ListarNotasResponse createListarNotasResponse() {
        return new ListarNotasResponse();
    }

    /**
     * Create an instance of {@link FiltrarProfe }
     * 
     */
    public FiltrarProfe createFiltrarProfe() {
        return new FiltrarProfe();
    }

    /**
     * Create an instance of {@link FiltroNotasResponse }
     * 
     */
    public FiltroNotasResponse createFiltroNotasResponse() {
        return new FiltroNotasResponse();
    }

    /**
     * Create an instance of {@link ListaProfes }
     * 
     */
    public ListaProfes createListaProfes() {
        return new ListaProfes();
    }

    /**
     * Create an instance of {@link Estudianteslist }
     * 
     */
    public Estudianteslist createEstudianteslist() {
        return new Estudianteslist();
    }

    /**
     * Create an instance of {@link ListaProfesResponse }
     * 
     */
    public ListaProfesResponse createListaProfesResponse() {
        return new ListaProfesResponse();
    }

    /**
     * Create an instance of {@link ListarNotas }
     * 
     */
    public ListarNotas createListarNotas() {
        return new ListarNotas();
    }

    /**
     * Create an instance of {@link NotasP1P2Response }
     * 
     */
    public NotasP1P2Response createNotasP1P2Response() {
        return new NotasP1P2Response();
    }

    /**
     * Create an instance of {@link NotasP1P2 }
     * 
     */
    public NotasP1P2 createNotasP1P2() {
        return new NotasP1P2();
    }

    /**
     * Create an instance of {@link AddNotaResponse }
     * 
     */
    public AddNotaResponse createAddNotaResponse() {
        return new AddNotaResponse();
    }

    /**
     * Create an instance of {@link ObtEstudianteResponse }
     * 
     */
    public ObtEstudianteResponse createObtEstudianteResponse() {
        return new ObtEstudianteResponse();
    }

    /**
     * Create an instance of {@link FiltrarProfeResponse }
     * 
     */
    public FiltrarProfeResponse createFiltrarProfeResponse() {
        return new FiltrarProfeResponse();
    }

    /**
     * Create an instance of {@link AddPromResponse }
     * 
     */
    public AddPromResponse createAddPromResponse() {
        return new AddPromResponse();
    }

    /**
     * Create an instance of {@link EstudianteslistResponse }
     * 
     */
    public EstudianteslistResponse createEstudianteslistResponse() {
        return new EstudianteslistResponse();
    }

    /**
     * Create an instance of {@link Notas }
     * 
     */
    public Notas createNotas() {
        return new Notas();
    }

    /**
     * Create an instance of {@link Profesor }
     * 
     */
    public Profesor createProfesor() {
        return new Profesor();
    }

    /**
     * Create an instance of {@link Esrudiantes }
     * 
     */
    public Esrudiantes createEsrudiantes() {
        return new Esrudiantes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtEstudiante")
    public JAXBElement<ObtEstudiante> createObtEstudiante(ObtEstudiante value) {
        return new JAXBElement<ObtEstudiante>(_ObtEstudiante_QNAME, ObtEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNota }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addNota")
    public JAXBElement<AddNota> createAddNota(AddNota value) {
        return new JAXBElement<AddNota>(_AddNota_QNAME, AddNota.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtroNotas")
    public JAXBElement<FiltroNotas> createFiltroNotas(FiltroNotas value) {
        return new JAXBElement<FiltroNotas>(_FiltroNotas_QNAME, FiltroNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addProm")
    public JAXBElement<AddProm> createAddProm(AddProm value) {
        return new JAXBElement<AddProm>(_AddProm_QNAME, AddProm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNotasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarNotasResponse")
    public JAXBElement<ListarNotasResponse> createListarNotasResponse(ListarNotasResponse value) {
        return new JAXBElement<ListarNotasResponse>(_ListarNotasResponse_QNAME, ListarNotasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarProfe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtrarProfe")
    public JAXBElement<FiltrarProfe> createFiltrarProfe(FiltrarProfe value) {
        return new JAXBElement<FiltrarProfe>(_FiltrarProfe_QNAME, FiltrarProfe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltroNotasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtroNotasResponse")
    public JAXBElement<FiltroNotasResponse> createFiltroNotasResponse(FiltroNotasResponse value) {
        return new JAXBElement<FiltroNotasResponse>(_FiltroNotasResponse_QNAME, FiltroNotasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProfes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listaProfes")
    public JAXBElement<ListaProfes> createListaProfes(ListaProfes value) {
        return new JAXBElement<ListaProfes>(_ListaProfes_QNAME, ListaProfes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Estudianteslist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Estudianteslist")
    public JAXBElement<Estudianteslist> createEstudianteslist(Estudianteslist value) {
        return new JAXBElement<Estudianteslist>(_Estudianteslist_QNAME, Estudianteslist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProfesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listaProfesResponse")
    public JAXBElement<ListaProfesResponse> createListaProfesResponse(ListaProfesResponse value) {
        return new JAXBElement<ListaProfesResponse>(_ListaProfesResponse_QNAME, ListaProfesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNotas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarNotas")
    public JAXBElement<ListarNotas> createListarNotas(ListarNotas value) {
        return new JAXBElement<ListarNotas>(_ListarNotas_QNAME, ListarNotas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotasP1P2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "notasP1P2Response")
    public JAXBElement<NotasP1P2Response> createNotasP1P2Response(NotasP1P2Response value) {
        return new JAXBElement<NotasP1P2Response>(_NotasP1P2Response_QNAME, NotasP1P2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotasP1P2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "notasP1P2")
    public JAXBElement<NotasP1P2> createNotasP1P2(NotasP1P2 value) {
        return new JAXBElement<NotasP1P2>(_NotasP1P2_QNAME, NotasP1P2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNotaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addNotaResponse")
    public JAXBElement<AddNotaResponse> createAddNotaResponse(AddNotaResponse value) {
        return new JAXBElement<AddNotaResponse>(_AddNotaResponse_QNAME, AddNotaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtEstudianteResponse")
    public JAXBElement<ObtEstudianteResponse> createObtEstudianteResponse(ObtEstudianteResponse value) {
        return new JAXBElement<ObtEstudianteResponse>(_ObtEstudianteResponse_QNAME, ObtEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FiltrarProfeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "filtrarProfeResponse")
    public JAXBElement<FiltrarProfeResponse> createFiltrarProfeResponse(FiltrarProfeResponse value) {
        return new JAXBElement<FiltrarProfeResponse>(_FiltrarProfeResponse_QNAME, FiltrarProfeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPromResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "addPromResponse")
    public JAXBElement<AddPromResponse> createAddPromResponse(AddPromResponse value) {
        return new JAXBElement<AddPromResponse>(_AddPromResponse_QNAME, AddPromResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EstudianteslistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EstudianteslistResponse")
    public JAXBElement<EstudianteslistResponse> createEstudianteslistResponse(EstudianteslistResponse value) {
        return new JAXBElement<EstudianteslistResponse>(_EstudianteslistResponse_QNAME, EstudianteslistResponse.class, null, value);
    }

}
