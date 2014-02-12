package mapmaker;

public class Componente {
	private String _Id;
	private static int _Serial;
	private String _Descripcion;
	private String _Tipo;
	private String _Sprite;
	
	public Componente(String psprite, String pdescripcion, String ptipo){
		_Id = ptipo + "@" + _Serial;
		_Serial++;
		_Descripcion = pdescripcion;
		_Tipo = ptipo;
	}
	
	/**
	 * @return the _Id
	 */
	public String getId() {
		return _Id;
	}
	/**
	 * @param _Id the Id to set
	 */
	public void setId(String pid) {
		this._Id = pid;
	}
	
	/**
	 * @return the _Descripcion
	 */
	public String getDescripcion() {
		return _Descripcion;
	}
	/**
	 * @param _Descripcion the _Descripcion to set
	 */
	public void setDescripcion(String pdescripcion) {
		this._Descripcion = pdescripcion;
	}
	/**
	 * @return the _Tipo
	 */
	public String getTipo() {
		return _Tipo;
	}
	/**
	 * @param _Tipo the _Tipo to set
	 */
	public void setTipo(String ptipo) {
		this._Tipo = ptipo;
	}
	/**
	 * @return the _Sprite
	 */
	public String getSprite() {
		return _Sprite;
	}
	/**
	 * @param _Sprite the _Sprite to set
	 */
	public void setSprite(String psprite) {
		this._Sprite = psprite;
	}
}
