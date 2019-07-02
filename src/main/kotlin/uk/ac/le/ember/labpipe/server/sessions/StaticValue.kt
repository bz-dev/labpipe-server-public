package uk.ac.le.ember.labpipe.server.sessions

class StaticValue {
    companion object {
        const val PROPS_FIELD_DB_HOST = "database.host"
        const val PROPS_FIELD_DB_PORT = "database.port"
        const val PROPS_FIELD_DB_NAME = "database.name"
        const val PROPS_FIELD_DB_USER = "database.user"
        const val PROPS_FIELD_DB_PASS = "database.pass"

        const val PROPS_FIELD_EMAIL_HOST = "mail.host"
        const val PROPS_FIELD_EMAIL_PORT = "mail.port"
        const val PROPS_FIELD_EMAIL_USER = "mail.user"
        const val PROPS_FIELD_EMAIL_PASS = "mail.pass"
        const val PROPS_FIELD_EMAIL_NOTIFICATION_NAME = "mail.notification.name"
        const val PROPS_FIELD_EMAIL_NOTIFICATION_ADDR = "mail.notification.addr"

        const val PROPS_FIELD_PATH_CACHE = "path.cache"

        const val DB_MONGO_COL_ACCESS_TOKEN = "ACCESS_TOKENS"
        const val DB_MONGO_COL_ROLE = "ROLES"
        const val DB_MONGO_COL_CLIENT_SETTING = "CLIENT_SETTINGS"
        const val DB_MONGO_COL_API_ACCESS_ROLES  = "API_ACCESS_ROLES"
        const val DB_MONGO_COL_OPERATORS = "OPERATORS"
        const val DB_MONGO_COL_STUDIES = "STUDIES"
        const val DB_MONGO_COL_FORM_TEMPLATES = "FORM_TEMPLATES"
        const val DB_MONGO_COL_REPORT_TEMPLATES = "REPORT_TEMPLATES"
        const val DB_MONGO_COL_INSTRUMENTS = "INSTRUMENTS"
        const val DB_MONGO_COL_LOCATIONS = "LOCATIONS"
        const val DB_MONGO_COL_EMAIL_GROUPS = "EMAIL_GROUPS"

        const val DB_MONGO_COL_FORM_DATA_PREFIX = "FORM_DATA_"

        const val DEFAULT_CONFIG_FILE_NAME = "config.ini"

        const val NOTIFICATION_STYLE_DO_NOT_NOTIFY = "DO_NOT_NOTIFY"
        const val NOTIFICATION_STYLE_NOTIFY_ALL = "NOTIFY_ALL"
        const val NOTIFICATION_STYLE_OPERATOR_ONLY = "OPERATOR_ONLY"
        const val NOTIFICATION_STYLE_ADMIN_ONLY = "ADMIN_ONLY"
        const val NOTIFICATION_STYLE_MEMBER_ONLY = "MEMBER_ONLY"
    }
}